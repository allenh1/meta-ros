# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Republishing of Selected TFs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native geometry-msgs message-generation message-runtime roscpp tf tf2-ros"
SRC_URI = "https://github.com/RobotWebTools-release/tf2_web_republisher-release/archive/release/kinetic/tf2_web_republisher/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54f6ca582b421a4b3d1d0c3e2b611726"
SRC_URI[sha256sum] = "887524f64f68d1f374bead0c55b87fe76a8009ccf577ce71e7f29e2fd9750e2b"
S = "${WORKDIR}/tf2_web_republisher-release-release-kinetic-tf2_web_republisher-0.3.2-0"

inherit catkin
