# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage allowing easy installation of Velodyne simulation components."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native velodyne-description velodyne-gazebo-plugins"
SRC_URI = "https://github.com/DataspeedInc-release/velodyne_simulator-release/archive/release/kinetic/velodyne_simulator/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "73ff5c49a3de0cd2f4e405dd8c95b4a2"
SRC_URI[sha256sum] = "32c7b687f6519837ba4d103be5dc29e4460a543cb4d4be4432c892769405087a"
S = "${WORKDIR}/velodyne_simulator-release-release-kinetic-velodyne_simulator-1.0.6-0"

inherit catkin
