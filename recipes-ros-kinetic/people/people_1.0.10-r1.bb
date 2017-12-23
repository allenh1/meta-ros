# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The people stack holds algorithms for perceiving people from a number of sensors"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native face-detector leg-detector people-msgs people-tracking-filter people-velocity-tracker"
SRC_URI = "https://github.com/OSUrobotics/${PN}-release/archive/release/kinetic/${PN}/1.0.10-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d1d3085817ef100c0cb4c4a3146d1459"
SRC_URI[sha256sum] = "e6eaac04c9b6ce253ff4e28b39da478c542c6f65823b3d216fc4fc684bf663d9"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.0.10-1"

inherit catkin
