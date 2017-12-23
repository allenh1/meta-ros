# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Merging multiple maps without knowledge of initial   positions of robots."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs map-msgs nav-msgs opencv3 roscpp tf2-geometry-msgs"
SRC_URI = "https://github.com/hrnr/m-explore-release/archive/release/kinetic/multirobot_map_merge/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6fdc71c139b9b4006d7fe96911aded4c"
SRC_URI[sha256sum] = "df9d13dc9aeb42feb2562689ce1fc9da1e99c3ace61d92fbe2be10d914bd6bda"
S = "${WORKDIR}/m-explore-release-release-kinetic-multirobot_map_merge-2.1.1-0"

inherit catkin
