# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the KDL RTT bindings"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=420fa5ed95759f902c21c406afe80a37"

DEPENDS = "catkin-native ocl orocos-kdl rtt"
SRC_URI = "https://github.com/orocos-gbp/rtt_geometry-release/archive/release/kinetic/kdl_typekit/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "24165c9f1fe0c9f52630e59a48730bd4"
SRC_URI[sha256sum] = "1e4b5606f26d32ba7f0cb68caaa986117e21cd9aaa0e5a090ab415a530d6fbbc"
S = "${WORKDIR}/rtt_geometry-release-release-kinetic-kdl_typekit-2.9.1-0"

inherit catkin
