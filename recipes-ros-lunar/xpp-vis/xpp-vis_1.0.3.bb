# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Visualization for the XPP Motion Framework."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kdl-parser robot-state-publisher roscpp tf visualization-msgs xpp-msgs xpp-states"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/lunar/xpp_vis/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "98d40e276becf707211170960e65a0e9"
SRC_URI[sha256sum] = "c1838f1ba5d40ca0660eb17d467c6f482d20e06c80a9fc64b2dbf5a91f2f5fc4"
S = "${WORKDIR}/xpp-release-release-lunar-xpp_vis-1.0.3-0"

inherit catkin
