# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A controller for driving a differential drive base to a pose goal or along a pat"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-threads geometry-msgs nodelet pluginlib roscpp sensor-msgs std-msgs tf yocs-controllers yocs-math-toolkit"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_diff_drive_pose_controller/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "66b93cb6345c05bc359a346034133ff4"
SRC_URI[sha256sum] = "c0dc2309fe8032f58be66aad8a7003014bcf30686e74abe2049f3bc692b882b3"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_diff_drive_pose_controller-0.8.2-0"

inherit catkin
