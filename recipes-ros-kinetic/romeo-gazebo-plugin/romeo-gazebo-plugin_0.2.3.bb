# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The romeo_gazebo_plugin package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native gazebo-plugins gazebo-ros gazebo-ros-control romeo-control romeo-description ros-control ros-controllers"
SRC_URI = "https://github.com/ros-aldebaran/romeo_virtual-release/archive/release/kinetic/romeo_gazebo_plugin/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0eda83c08e8914e56a0a9dd55c033d33"
SRC_URI[sha256sum] = "d1c743e2165fe557a11673a131c29a03f41bf2716853579f6f12189c04dd6904"
S = "${WORKDIR}/romeo_virtual-release-release-kinetic-romeo_gazebo_plugin-0.2.3-0"

inherit catkin
