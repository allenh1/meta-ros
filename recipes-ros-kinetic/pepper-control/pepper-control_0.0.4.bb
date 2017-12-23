# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Control for Pepper robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native controller-manager robot-state-publisher"
SRC_URI = "https://github.com/ros-naoqi/pepper_virtual-release/archive/release/kinetic/pepper_control/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "41334f0fb9d8b74e3e549a85c3d93fea"
SRC_URI[sha256sum] = "b19d564af1fb6a5531edd4839544b0add1e6922df38d61b75d07c106811e57a6"
S = "${WORKDIR}/pepper_virtual-release-release-kinetic-pepper_control-0.0.4-0"

inherit catkin
