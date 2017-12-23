# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "turtlebot_description provides a complete 3D model of the TurtleBot for simulati"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native create-description kobuki-description urdf xacro"
SRC_URI = "https://github.com/turtlebot-release/turtlebot-release/archive/release/kinetic/turtlebot_description/2.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f351c704c97b489e3f1203c3d7eb92af"
SRC_URI[sha256sum] = "f516927f1373ea37fcc1e7f844f5b5799e3c7ab0c14d1e7863576f57bcfdb83f"
S = "${WORKDIR}/turtlebot-release-release-kinetic-turtlebot_description-2.4.2-0"

inherit catkin
