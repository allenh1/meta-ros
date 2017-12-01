# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library of ros controllers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diff-drive-controller effort-controllers force-torque-sensor-controller forward-command-controller gripper-action-controller imu-sensor-controller joint-state-controller joint-trajectory-controller position-controllers rqt-joint-trajectory-controller velocity-controllers"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/ros_controllers/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1a2627bbab8ac93153ec7688638a3773"
SRC_URI[sha256sum] = "ecb107aaac4f732379a1f57344ecb0959d247c32baadea2ee333346c35f0d501"
S = "${WORKDIR}/ros_controllers-release-release-lunar-ros_controllers-0.13.1-0"

inherit catkin
