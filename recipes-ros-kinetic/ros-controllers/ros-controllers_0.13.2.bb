# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library of ros controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diff-drive-controller effort-controllers force-torque-sensor-controller forward-command-controller gripper-action-controller imu-sensor-controller joint-state-controller joint-trajectory-controller position-controllers rqt-joint-trajectory-controller velocity-controllers"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/ros_controllers/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e074f57b3b5d96fefccc3a66651871ec"
SRC_URI[sha256sum] = "78dc987664957f1be6a4038efd6b9932f37899acf6db290b96aee35c20806581"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-ros_controllers-0.13.2-0"

inherit catkin
