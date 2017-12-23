# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_collision_velocity_filter package is a package for collision avoidance u"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cob-footprint-observer costmap-2d dynamic-reconfigure geometry-msgs nav-msgs roscpp tf visualization-msgs"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_collision_velocity_filter/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db3b9387ca32e1ede4dfa0e7ae01604e"
SRC_URI[sha256sum] = "21c53fbe75486cb51b69ea534d6f92c609da53f259ef79bd43500baa32307f4c"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_collision_velocity_filter-0.7.0-0"

inherit catkin
