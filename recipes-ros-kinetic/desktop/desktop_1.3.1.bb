# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native common-tutorials geometry-tutorials robot ros-tutorials roslint visualization-tutorials viz"
SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/kinetic/${PN}/1.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6175618250f27f7fccaf4e2ab4c0dfac"
SRC_URI[sha256sum] = "1bc631edbfb668714bd8a91a8b2879ea00c08b71c89d3b9c0daeaf3fbbb121b0"
S = "${WORKDIR}/metapackages-release-release-kinetic-${PN}-1.3.1-0"

inherit catkin
