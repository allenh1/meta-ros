# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Description of the Nao robot model that can be used with robot_state_publisher t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-filters robot-state-publisher roscpp sensor-msgs tf urdf xacro"
SRC_URI = "https://github.com/ros-naoqi/nao_robot-release/archive/release/kinetic/nao_description/0.5.15-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "78020e3232910ab8a469aeb07a315e7a"
SRC_URI[sha256sum] = "c35b71b27a5fa8e5bef94f76d56481471f7c6ddc93f16463d4e4537d6bdb362c"
S = "${WORKDIR}/nao_robot-release-release-kinetic-nao_description-0.5.15-0"

inherit catkin
