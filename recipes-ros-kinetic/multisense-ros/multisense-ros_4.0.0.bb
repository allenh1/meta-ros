# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "multisense_ros"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native cv-bridge dynamic-reconfigure genmsg geometry-msgs image-geometry image-transport libturbojpeg message-generation message-runtime multisense-lib rosbag roscpp sensor-msgs std-msgs stereo-msgs tf yaml-cpp"
SRC_URI = "https://github.com/carnegieroboticsllc/multisense_ros-release/archive/release/kinetic/multisense_ros/4.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e44111044036ffbabd0d6316b84fd34c"
SRC_URI[sha256sum] = "64dbfe1a34999ec414c8caec8f7b9d34baf10c08e74584ace80cab60122ce0d5"
S = "${WORKDIR}/multisense_ros-release-release-kinetic-multisense_ros-4.0.0-0"

inherit catkin
