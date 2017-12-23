# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Gazebo plugin for Pepper robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native gazebo-plugins gazebo-ros gazebo-ros-control pepper-control pepper-description ros-control ros-controllers"
SRC_URI = "https://github.com/ros-naoqi/pepper_virtual-release/archive/release/kinetic/pepper_gazebo_plugin/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b00345e0dee54bf19ce51f12a344e874"
SRC_URI[sha256sum] = "4391f6c61d2932d3a45400773c68390748b28c64d8d5fbc483f4d7175293e78c"
S = "${WORKDIR}/pepper_virtual-release-release-kinetic-pepper_gazebo_plugin-0.0.4-0"

inherit catkin
