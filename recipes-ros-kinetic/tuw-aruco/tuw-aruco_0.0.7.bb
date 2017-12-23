# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a wrapper around the marker detection library ArUco."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure image-geometry image-transport marker-msgs roscpp rospy std-msgs tf"
SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/kinetic/tuw_aruco/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d0e420c98746a0aad6db1bae71517041"
SRC_URI[sha256sum] = "e599b0167ff7524e874fa855fb00781f76d3291bb0518e2308e17d6ab8fdaed4"
S = "${WORKDIR}/tuw_marker_detection-release-release-kinetic-tuw_aruco-0.0.7-0"

inherit catkin
