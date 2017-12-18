# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "slam_gmapping contains a wrapper around gmapping which provides SLAM capabilitie"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "CreativeCommons-by-nc-sa-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=11e24f757f025b2cbebd5b14b4a7ca19"

DEPENDS = "catkin-native catkin gmapping openslam-gmapping"
SRC_URI = "https://github.com/ros-gbp/slam_gmapping-release/archive/release/lunar/slam_gmapping/1.3.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "131a8e78c7ad022a23cad0400f4b4abe"
SRC_URI[sha256sum] = "55f5c6105405a89f492c29687d978634b19ad13ba6e0244936ad4d658cf5bdf8"
S = "${WORKDIR}/slam_gmapping-release-release-lunar-slam_gmapping-1.3.9-0"

inherit catkin
