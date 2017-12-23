# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "euscollada"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp-devel catkin-native cmake-modules collada-dom collada-parser collada-urdf libqhull liburdfdom-dev mk resource-retriever rosboost-cfg rosbuild roscpp rospack rostest tf urdf yaml-cpp"
SRC_URI = "https://github.com/tork-a/jsk_model_tools-release/archive/release/kinetic/${PN}/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "976cafbd4502babda5bc6a4326b83338"
SRC_URI[sha256sum] = "ab4e5f072afbd7ab574b651eb376a40bc0ab31b1c07a255b573f7bf615be5575"
S = "${WORKDIR}/jsk_model_tools-release-release-kinetic-${PN}-0.3.5-0"

inherit catkin
