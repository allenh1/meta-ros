# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python interface for camera calibration information.      This ROS package provi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg python-pyyaml rospy rostest sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/camera_info_manager_py-release/archive/release/kinetic/camera_info_manager_py/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bfbd79727a2d82b6d20a819a80836fda"
SRC_URI[sha256sum] = "3f698bd22b69737a57ef35e5a26c798defd431511e590b0e0ffeb315397acba6"
S = "${WORKDIR}/camera_info_manager_py-release-release-kinetic-camera_info_manager_py-0.2.3-0"

inherit catkin
