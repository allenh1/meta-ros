# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This metapackage contains tools for integrating the Orocos Kinematics and     Dy"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native eigen-typekit kdl-typekit"
SRC_URI = "https://github.com/orocos-gbp/rtt_geometry-release/archive/release/kinetic/rtt_geometry/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "072aa4036728702f3382bded087133b6"
SRC_URI[sha256sum] = "b8c738e4a6569d7d54a3b8201a70e91afe8708ca9acf62b8ba4b2ffe671cd168"
S = "${WORKDIR}/rtt_geometry-release-release-kinetic-rtt_geometry-2.9.1-0"

inherit catkin
