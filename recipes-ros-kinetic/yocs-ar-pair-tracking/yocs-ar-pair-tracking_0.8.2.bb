# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The AR pair tracking package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ar-track-alvar-msgs catkin-native geometry-msgs roscpp sensor-msgs std-msgs yocs-ar-marker-tracking yocs-math-toolkit yocs-msgs"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_ar_pair_tracking/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b5b00e3b4ef6b28202c5a5ea4da8c21f"
SRC_URI[sha256sum] = "7827ddc6602cbb83f1b5aa101aea9142cfbc11792b83ac1d18802b727881fc28"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_ar_pair_tracking-0.8.2-0"

inherit catkin
