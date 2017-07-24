# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package holds the diagnostic messages which provide the     standardized in"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/diagnostic_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "74afa8965114b3f49203463e8e675435"
SRC_URI[sha256sum] = "75e3dbe597f2beb7ff7aa2e3dd848c177c32cbf83ba03dbd68962ff73b21db11"
S = "${WORKDIR}/common_msgs-release-release-lunar-diagnostic_msgs-1.12.5-0"

inherit catkin
