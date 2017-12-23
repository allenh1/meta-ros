# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "slam_gmapping contains a wrapper around gmapping which provides SLAM capabilitie"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=11e24f757f025b2cbebd5b14b4a7ca19"

DEPENDS = "catkin-native gmapping openslam-gmapping"
SRC_URI = "https://github.com/ros-gbp/slam_gmapping-release/archive/release/kinetic/slam_gmapping/1.3.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6bc44cbea5d693d7947470dcafcc2343"
SRC_URI[sha256sum] = "a3ed6fd4d6e98cdb4dccab14ff617ebfb771c14301f054129f4f44a5693b3b64"
S = "${WORKDIR}/slam_gmapping-release-release-kinetic-slam_gmapping-1.3.9-0"

inherit catkin
