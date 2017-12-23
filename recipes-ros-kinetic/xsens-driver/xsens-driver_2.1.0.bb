# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Driver for XSens MT/MTi/MTi-G devices."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs geometry-msgs rospy sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/ethz-asl/ethzasl_xsens_driver-release/archive/release/kinetic/xsens_driver/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "88a1d3e175988c68abb969409a838196"
SRC_URI[sha256sum] = "a2064447f5fc088191b09478b765b3274cad61c2122fff5258c7d8944c68c3dc"
S = "${WORKDIR}/ethzasl_xsens_driver-release-release-kinetic-xsens_driver-2.1.0-0"

inherit catkin
