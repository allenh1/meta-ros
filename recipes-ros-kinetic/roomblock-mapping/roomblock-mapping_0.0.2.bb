# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The roomblock_mapping package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gmapping hector-mapping map-server robot-state-publisher rosbag rviz slam-karto"
SRC_URI = "https://github.com/tork-a/roomblock-release/archive/release/kinetic/roomblock_mapping/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c1fff119feef694e1d719294fe31be17"
SRC_URI[sha256sum] = "58b3139207f765914135ba9687832e49f9add781b72280e51c28bf3633e0febb"
S = "${WORKDIR}/roomblock-release-release-kinetic-roomblock_mapping-0.0.2-0"

inherit catkin
