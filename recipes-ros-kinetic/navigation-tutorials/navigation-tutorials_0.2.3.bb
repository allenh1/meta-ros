# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Navigation related tutorials."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native laser-scan-publisher-tutorial navigation-stage odometry-publisher-tutorial point-cloud-publisher-tutorial robot-setup-tf-tutorial roomba-stage simple-navigation-goals-tutorial"
SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/kinetic/navigation_tutorials/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "22d5a58ca5fc8a8f06bb8034e713d21a"
SRC_URI[sha256sum] = "8e04020090600f574236e8c6e4bd9aa6f8c9c9952839df279cb7bac4e86d6aad"
S = "${WORKDIR}/navigation_tutorials-release-release-kinetic-navigation_tutorials-0.2.3-0"

inherit catkin
