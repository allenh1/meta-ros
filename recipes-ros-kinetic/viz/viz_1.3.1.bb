# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ros-base rqt-common-plugins rqt-robot-plugins rviz"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/kinetic/${PN}/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bb1fc1811a8438ca02abbd74dbe04b01"
SRC_URI[sha256sum] = "ce4e42839b9d85b7c6d0ba87cb34b7c7c2f5fd6fa5e06434fc3e51a645f3a5c4"
S = "${WORKDIR}/metapackages-release-release-kinetic-${PN}-1.3.1-0"

inherit catkin
