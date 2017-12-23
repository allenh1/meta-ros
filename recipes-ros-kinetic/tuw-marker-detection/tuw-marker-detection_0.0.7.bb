# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The tuw_marker_detection package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native tuw-aruco tuw-ellipses tuw-marker-pose-estimation"
SRC_URI = "https://github.com/tuw-robotics/tuw_marker_detection-release/archive/release/kinetic/tuw_marker_detection/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7623d491357f9a8d9b013244eb0521aa"
SRC_URI[sha256sum] = "ee1a37fd7c3a927115d8fbde78495719fa4417e4841aabebb486459805e22ddd"
S = "${WORKDIR}/tuw_marker_detection-release-release-kinetic-tuw_marker_detection-0.0.7-0"

inherit catkin
