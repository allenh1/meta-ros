# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Uses opencv to find checkboards and compute their 6D poses with respect to the i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge dynamic-reconfigure dynamic-tf-publisher eigen-conversions image-geometry jsk-recognition-msgs message-filters posedetection-msgs rosconsole roscpp sensor-msgs tf tf2"
SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/kinetic/checkerboard_detector/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e76bf81c01f415bcfffa989939abfe14"
SRC_URI[sha256sum] = "32b5a454dc13e04f01ae658fe16308060a9133828c9b640ed2ecdc84bbaf79d7"
S = "${WORKDIR}/jsk_recognition-release-release-kinetic-checkerboard_detector-1.2.3-0"

inherit catkin
