# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roseus_tutorials"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ar-track-alvar catkin-native checkerboard-detector image-proc image-view2 jsk-recognition-msgs opencv-apps posedetection-msgs pr2eus roseus visualization-msgs"
SRC_URI = "https://github.com/tork-a/jsk_roseus-release/archive/release/kinetic/roseus_tutorials/1.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3f872b20186a7f9f5b8f310c5dee2558"
SRC_URI[sha256sum] = "5072184ef35ea0820cbcf345ff9558d8d9fa2dfe619c6c596e1693edc7977931"
S = "${WORKDIR}/jsk_roseus-release-release-kinetic-roseus_tutorials-1.6.3-0"

inherit catkin
