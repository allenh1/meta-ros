# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "COB teleop interactive marker for RViz provided by dcgm-robotics@FIT group."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native geometry-msgs interactive-markers roscpp rviz std-msgs tf visualization-msgs"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/cob_interactive_teleop/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0108d8dea23ea06cc4853e4c0107f1d7"
SRC_URI[sha256sum] = "c9c778f108e4d3219b749385aa2a3486684067913bc2be93123ca0763301d1d5"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-cob_interactive_teleop-0.6.6-0"

inherit catkin
