# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "pointcloud_tools"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libvtk nav-msgs pcl-conversions pcl-ros roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/srv/srv_tools-release/archive/release/kinetic/pointcloud_tools/0.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b507dee613b39db11d7dc217ff828871"
SRC_URI[sha256sum] = "747fc3d2106b4952cbc9120a73215752e9203421976c6dc3526d21254b6904ce"
S = "${WORKDIR}/srv_tools-release-release-kinetic-pointcloud_tools-0.0.3-0"

inherit catkin
