# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The marker_msgs package contains messages usable to setup a marker/fiducial syst"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/tuw-robotics/marker_msgs-release/archive/release/kinetic/marker_msgs/0.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c1f0608c1612808dcef421ccf6b3a21"
SRC_URI[sha256sum] = "81af0238063e24c472a0b553a9b341bbc1a1e68406ae482aad3a9dbc79371242"
S = "${WORKDIR}/marker_msgs-release-release-kinetic-marker_msgs-0.0.5-0"

inherit catkin
