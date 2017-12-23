# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS tools and scripts related to bagfiles"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers catkin-native cv-bridge image-geometry image-proc console-bridge message-filters rosbag rospy sensor-msgs stereo-image-proc"
SRC_URI = "https://github.com/srv/srv_tools-release/archive/release/kinetic/bag_tools/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ce83eca344fbcd852b67b4cfc27443e7"
SRC_URI[sha256sum] = "d59e4412c91e63b53f466cb1e75d24fb46be9ab61edfa6c6a0e11ad7cc9ff14d"
S = "${WORKDIR}/srv_tools-release-release-kinetic-bag_tools-0.0.3-0"

inherit catkin
