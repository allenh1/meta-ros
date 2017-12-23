# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "object_recognition_ros_visualization contains rviz plugins to visualize ork dete"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native object-recognition-msgs object-recognition-ros pluginlib rviz"
SRC_URI = "https://github.com/ros-gbp/object_recognition_ros_visualization-release/archive/release/kinetic/object_recognition_ros_visualization/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e139044292c769ba1073cb43ba02dfa"
SRC_URI[sha256sum] = "3c5a611d2f1d9504213727daf4671b91a6deaac35210f8f9b1d087d1402461c9"
S = "${WORKDIR}/object_recognition_ros_visualization-release-release-kinetic-object_recognition_ros_visualization-0.3.8-0"

inherit catkin
