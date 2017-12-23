# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The nao_control package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native controller-manager effort-controllers joint-state-controller joint-trajectory-controller robot-state-publisher"
SRC_URI = "https://github.com/ros-naoqi/nao_virtual-release/archive/release/kinetic/nao_control/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bc995d8a9d388a03590d958faa777f77"
SRC_URI[sha256sum] = "b704c84911e5d3d30e104e8032f6c5ef7c3163f667ba47104a804e447d0a124c"
S = "${WORKDIR}/nao_virtual-release-release-kinetic-nao_control-0.0.6-0"

inherit catkin
