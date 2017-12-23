# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "For every image, computes its sift features and send a new message with the imag"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cmake-modules cv-bridge image-transport jsk-recognition-utils libsiftfast nodelet posedetection-msgs roscpp sensor-msgs"
SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/kinetic/${PN}/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "886a8181be066ed2c3e7d8fb27000069"
SRC_URI[sha256sum] = "cb85d08a2ee51aeee77bf5836d95fbab9c1b56d34be32197995b382a90314417"
S = "${WORKDIR}/jsk_recognition-release-release-kinetic-${PN}-1.2.3-0"

inherit catkin
