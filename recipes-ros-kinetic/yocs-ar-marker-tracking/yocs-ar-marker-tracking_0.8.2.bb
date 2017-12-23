# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Collecting, tracking and generating statistics for ar markers from ar_track_alva"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ar-track-alvar-msgs catkin-native geometry-msgs roscpp sensor-msgs yaml-cpp yocs-math-toolkit"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_ar_marker_tracking/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9bb4d24041d2cd21a35e0da8a461032e"
SRC_URI[sha256sum] = "af4176e9087c34093f4462a38dfd67e38e62844e632a4a957aa33580e63ef1c4"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_ar_marker_tracking-0.8.2-0"

inherit catkin
