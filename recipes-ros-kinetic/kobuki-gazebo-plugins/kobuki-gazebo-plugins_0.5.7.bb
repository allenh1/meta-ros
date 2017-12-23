# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Kobuki-specific ROS plugins for Gazebo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native gazebo-plugins gazebo-ros geometry-msgs kobuki-msgs nav-msgs roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_desktop-release/archive/release/kinetic/kobuki_gazebo_plugins/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "046c137d7ac1cb189cfe7c4fd24e2cbf"
SRC_URI[sha256sum] = "c157ce87feed82ceba296a66a2f37ad4c77508f8e882e77bcd7d9d3149afd499"
S = "${WORKDIR}/kobuki_desktop-release-release-kinetic-kobuki_gazebo_plugins-0.5.7-0"

inherit catkin
