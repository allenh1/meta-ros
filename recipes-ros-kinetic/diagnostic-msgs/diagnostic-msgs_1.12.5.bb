# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package holds the diagnostic messages which provide the     standardized in"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/diagnostic_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e5fc0804d83a8ef25d06d63b0b0a084"
SRC_URI[sha256sum] = "a27da674a80ffee25e2baadf139b7e6696e998792e9e65ddaf15ccf7a56009d5"
S = "${WORKDIR}/common_msgs-release-release-kinetic-diagnostic_msgs-1.12.5-0"

inherit catkin
