# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D visualization tool for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD & CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp assimp-dev catkin-native cmake-modules eigen geometry-msgs image-transport interactive-markers laser-geometry libogre-dev libqt5-core libqt5-gui libqt5-opengl libqt5-opengl-dev libqt5-widgets liburdfdom-headers-dev map-msgs media-export message-filters nav-msgs opengl pluginlib python-qt-binding qtbase5-dev resource-retriever rosbag rosconsole roscpp roslib rospy sensor-msgs std-msgs std-srvs tf libtinyxml urdf visualization-msgs yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/1.12.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8fd004b44146e2d3839a4647d948713a"
SRC_URI[sha256sum] = "ea02073effb34216f87304485abc5ab314ac2d1f970f5524cd3b08ac0e0d9fbc"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-1.12.14-0"

inherit catkin
