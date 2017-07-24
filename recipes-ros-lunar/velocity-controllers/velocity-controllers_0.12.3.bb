# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "velocity_controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles python-empy-native control-msgs control-toolbox controller-interface forward-command-controller realtime-tools urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/velocity_controllers/0.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "60c3a21cf42af0b47b1ec45a269e89d6"
SRC_URI[sha256sum] = "884b4a0ef22725cf5807962acfe6478a6e975c0490b04688a398dc6b8ddf5d18"
S = "${WORKDIR}/ros_controllers-release-release-lunar-velocity_controllers-0.12.3-0"

inherit catkin
