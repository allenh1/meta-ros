# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Extra nodes and plugins for ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3 & LGPL-3 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native cmake-modules geometry-msgs mavros mavros-msgs roscpp sensor-msgs std-msgs tf urdf visualization-msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/kinetic/mavros_extras/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54b423234e81a86b0d9707e17900cded"
SRC_URI[sha256sum] = "f281d2380961ce7c8194e8417f34a38d474feacf5ed159815db3a33a8b242f86"
S = "${WORKDIR}/mavros-release-release-kinetic-mavros_extras-0.22.0-0"

inherit catkin
