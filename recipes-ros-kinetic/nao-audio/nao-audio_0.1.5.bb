# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package for the Nao robot, providing access to NAOqi audio proxies"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nao-interaction-msgs roslaunch rospy std-msgs std-srvs"
SRC_URI = "https://github.com/ros-naoqi/nao_interaction-release/archive/release/kinetic/nao_audio/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5a3390c7c3e9468c0d722cbc5fa68898"
SRC_URI[sha256sum] = "f1ef6881e66611729e72cb1562936c27ef5cfe8b4c0d2d412ff39582ed9da533"
S = "${WORKDIR}/nao_interaction-release-release-kinetic-nao_audio-0.1.5-0"

inherit catkin
