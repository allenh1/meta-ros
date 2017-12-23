# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin ros-base rqt-common-plugins rqt-robot-plugins rviz"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/lunar/${PN}/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3168508ac3738ae30630000b6ca86ed4"
SRC_URI[sha256sum] = "7989c6cc97ac1c874f761219ad2919cc120d848c83f0d9399b2dda62f000fb24"
S = "${WORKDIR}/metapackages-release-release-lunar-${PN}-1.3.1-0"

inherit catkin
