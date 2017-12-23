# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "pr2eus_tutorials"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native jsk-pcl-ros pr2eus"
SRC_URI = "https://github.com/tork-a/jsk_pr2eus-release/archive/release/kinetic/pr2eus_tutorials/0.3.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "58475937efac891e7891c3d53041b9b4"
SRC_URI[sha256sum] = "6436edb2cfceaf82fc201b207f72ad2ee353afbbf100d49e8329c5db83de852f"
S = "${WORKDIR}/jsk_pr2eus-release-release-kinetic-pr2eus_tutorials-0.3.10-0"

inherit catkin
