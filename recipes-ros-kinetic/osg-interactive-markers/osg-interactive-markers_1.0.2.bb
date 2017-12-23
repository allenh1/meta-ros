# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is basically an OpenSceneGraph (OSG) adaptation of the Interactive "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native interactive-markers libopenscenegraph osg-markers osg-utils roscpp tf visualization-msgs"
SRC_URI = "https://github.com/uji-ros-pkg/visualization_osg-release/archive/release/kinetic/osg_interactive_markers/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bcf67cdb9953c8ed47cdf9bc71dcaed5"
SRC_URI[sha256sum] = "61e77c9b041cda3c946fb1358527e33f7551875f3f2202d7f823c521419aba25"
S = "${WORKDIR}/visualization_osg-release-release-kinetic-osg_interactive_markers-1.0.2-0"

inherit catkin
