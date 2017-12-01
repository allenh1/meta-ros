# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a ROS wrapper for OpenSlam's Gmapping.    The gmapping pac"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "CreativeCommons-by-nc-sa-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=11e24f757f025b2cbebd5b14b4a7ca19"

DEPENDS = "catkin-native nav-msgs nodelet openslam-gmapping roscpp rostest tf"
SRC_URI = "https://github.com/ros-gbp/slam_${PN}-release/archive/release/lunar/${PN}/1.3.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e45cbd243ce472e7ee6213d8b180af43"
SRC_URI[sha256sum] = "09c61e34c838574b27e88865e4ddd9f459ce868a3fc4fecf771999c2e35cfec1"
S = "${WORKDIR}/slam_${PN}-release-release-lunar-${PN}-1.3.9-0"

inherit catkin
