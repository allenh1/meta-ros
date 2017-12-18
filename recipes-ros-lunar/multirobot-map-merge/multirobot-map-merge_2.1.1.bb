# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Merging multiple maps without knowledge of initial   positions of robots."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin geometry-msgs map-msgs nav-msgs opencv3 roscpp tf2-geometry-msgs"
SRC_URI = "https://github.com/hrnr/m-explore-release/archive/release/lunar/multirobot_map_merge/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d95fb8102a02e2bb037b47867691294"
SRC_URI[sha256sum] = "fdf2d7c8ec63691ec384b62f542ed53ddc47a8b4cbe2f92e46ced60e4e33b413"
S = "${WORKDIR}/m-explore-release-release-lunar-multirobot_map_merge-2.1.1-0"

inherit catkin
