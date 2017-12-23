# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "object_recognition_core contains tools to launch several recognition pipelines, "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib boost catkin-native cmake-modules ecto ecto-image-pipeline ecto-ros geometric-shapes object-recognition-core object-recognition-msgs pluginlib rostopic"
SRC_URI = "https://github.com/ros-gbp/object_recognition_ros-release/archive/release/kinetic/object_recognition_ros/0.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2706b631068450fc4e4e0e91c2eb2e73"
SRC_URI[sha256sum] = "9da5485f0e80811676a5a09e80e4f5f1945f94f5e963774cf371b35825383d75"
S = "${WORKDIR}/object_recognition_ros-release-release-kinetic-object_recognition_ros-0.3.7-0"

inherit catkin
