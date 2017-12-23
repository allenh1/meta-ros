# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "franka_description contains URDF files and meshes of Franka Emika robots"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native xacro"
SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/kinetic/franka_description/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ad52ad4905630d848f523a36f1d63182"
SRC_URI[sha256sum] = "6d76c92f0654c2be3d32a75f296a16b595022d93b15920b893bc09db9f4425bf"
S = "${WORKDIR}/franka_ros-release-release-kinetic-franka_description-0.1.2-0"

inherit catkin
