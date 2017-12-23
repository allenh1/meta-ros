# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Kobuki simulation for Gazebo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-plugins gazebo-ros kobuki-description kobuki-gazebo-plugins kobuki-random-walker kobuki-safety-controller robot-state-publisher yocs-cmd-vel-mux"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_desktop-release/archive/release/kinetic/kobuki_gazebo/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "12a1ed4bdc6d2b7e6eee479efefcb44d"
SRC_URI[sha256sum] = "0478e18c65b686328b7a9e97c401e46077d8ce7803b8af2f5600ca8074a46008"
S = "${WORKDIR}/kobuki_desktop-release-release-kinetic-kobuki_gazebo-0.5.7-0"

inherit catkin
