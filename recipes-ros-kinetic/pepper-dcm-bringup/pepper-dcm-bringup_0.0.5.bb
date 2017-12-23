# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bring-up the dcm driver to control Pepper"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=28;endline=28;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native naoqi-dcm-driver pepper-control rospy"
SRC_URI = "https://github.com/ros-naoqi/pepper_dcm_robot-release/archive/release/kinetic/pepper_dcm_bringup/0.0.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "08d0fb7ce9dcf3f5e5c71c7c285ce180"
SRC_URI[sha256sum] = "07a0dc005b65e85859acfb9f530b43f1d3fe082524e942f4739840133b80170f"
S = "${WORKDIR}/pepper_dcm_robot-release-release-kinetic-pepper_dcm_bringup-0.0.5-0"

inherit catkin
